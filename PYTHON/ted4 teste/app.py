#Willian Eduardo Jascowski Petry

t_eleitores = 175

candidatos = {}

print("Cadastro dos candidatos (5 no total):")
for i in range(5):
    while True:
        nome = input(f"Nome do candidato {i + 1}: ").strip()  
        numero = input(f"Número do candidato {i + 1}: ").strip()    

        
        if any(c['nome'] == nome or c['numero'] == numero for c in candidatos.values()):
            print("Nome ou número já cadastrados. Digite novamente!")
        else:
            candidatos[numero] = {
                "nome": nome,
                "votos_total": 0,
                "votos_mulher": 0,  
            }
            break


print("\nInício da Votação.")
votos_registrados = 0

while votos_registrados < t_eleitores:
    sexo = input("Informe seu sexo (M/F): ").strip().upper()  
    if sexo not in ["M", "F"]:
        print("Sexo inválido! Digite novamente.")
        continue

    
    n_voto = input('Informe o número do candidato em que deseja votar (ou digite "FIM" para encerrar): ').strip().upper()

    if n_voto.upper() == "FIM":  
        print("Votação encerrada antecipadamente.")
        break

    if n_voto not in candidatos:
        print("Candidato inválido.")
        continue

    candidatos[n_voto]["votos_total"] += 1
    if sexo == "F":
        candidatos[n_voto]["votos_mulher"] += 1  

    votos_registrados += 1
    print(f"Voto registrado. Total de votos até agora: {votos_registrados}")

print("\nResultado Final:")  
vencedor = None
maior_votos = -1

sem_voto = []

mais_votado_feminino = None
maior_votado_feminino = -1 

for numero, dados in candidatos.items():
    nome = dados["nome"]
    total = dados["votos_total"]
    mulheres = dados["votos_mulher"]

    if total > maior_votos:
        maior_votos = total
        vencedor = (nome, numero)

    if total == 0:
        sem_voto.append(nome)

    if mulheres > maior_votado_feminino:  
        maior_votado_feminino = mulheres
        mais_votado_feminino = nome

if votos_registrados > 0:
    percentual = (maior_votos / votos_registrados) * 100
    print(f"- Vencedor: {vencedor[0]} (Número: {vencedor[1]}) com {percentual:.2f}% dos votos.")
else:
    print("- Nenhum voto registrado.")  

if sem_voto:
    print("- Candidato(s) sem votos:", ", ".join(sem_voto))
else:
    print("- Todos os candidatos receberam votos.")

if mais_votado_feminino:
    print(f"- Candidato com mais votos femininos: {mais_votado_feminino}")  
