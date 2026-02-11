
#Willian Eduardo Jascowski Petry


import datetime

MAX_ENTREVISTAS = 135


entrevistados = 0
pessoas = []
salarios_adultos = []
adultos_desempregados_homens = 0
adultos_desempregados_mulheres = 0
quantidade_criancas = 0
pessoa_mais_jovem = None


def input_opcao(mensagem, opcoes):
    while True:
        valor = input(mensagem).strip().upper()
        if valor in opcoes:
            return valor
        print(f"Entrada inválida. Opções válidas: {', '.join(opcoes)}")


def input_idade(mensagem):
    while True:
        try:
            idade = int(input(mensagem))
            if idade >= 0:
                return idade
            else:
                print("Idade deve ser um número positivo.")
        except ValueError:
            print("Digite uma idade válida (número inteiro).")


print("\n--- Início da Pesquisa no Abrigo Municipal ---")
while entrevistados < MAX_ENTREVISTAS:
    print(f"\nEntrevistado {entrevistados + 1}:")

    nome = input("Nome: ").strip().title()
    sexo = input_opcao("Sexo (M/F): ", ["M", "F"])
    idade = input_idade("Idade: ")

    entrevistado = {"nome": nome, "sexo": sexo, "idade": idade}
    
   
    if idade <= 12:
        quantidade_criancas += 1
    elif idade >= 18:
        tem_emprego = input_opcao("Possui emprego? (S/N): ", ["S", "N"])
        if tem_emprego == "S":
            while True:
                try:
                    salario = float(input("Informe a renda salarial: R$ ").replace(',', '.'))
                    if salario >= 0:
                        salarios_adultos.append(salario)
                        break
                    else:
                        print("Salário não pode ser negativo.")
                except ValueError:
                    print("Digite um valor numérico válido para o salário.")
        else:
            if sexo == "M":
                adultos_desempregados_homens += 1
            else:
                adultos_desempregados_mulheres += 1

    pessoas.append(entrevistado)
    entrevistados += 1

   
    if pessoa_mais_jovem is None or idade < pessoa_mais_jovem["idade"]:
        pessoa_mais_jovem = entrevistado

    
    continuar = input_opcao("Deseja continuar a pesquisa? (S/N): ", ["S", "N"])
    if continuar == "N":
        print("Encerrando a pesquisa por hoje.")
        break


percentual_criancas = (quantidade_criancas / entrevistados) * 100 if entrevistados > 0 else 0
media_salarial = sum(salarios_adultos) / len(salarios_adultos) if salarios_adultos else 0


if adultos_desempregados_homens > adultos_desempregados_mulheres:
    mais_desempregados = "Homens"
elif adultos_desempregados_mulheres > adultos_desempregados_homens:
    mais_desempregados = "Mulheres"
else:
    mais_desempregados = "Empate"


print("\n--- Resultado da Pesquisa ---")
print(f"Total de pessoas entrevistadas: {entrevistados}")
if pessoa_mais_jovem:
    print(f"Pessoa mais jovem: {pessoa_mais_jovem['nome']}, Sexo: {pessoa_mais_jovem['sexo']}, Idade: {pessoa_mais_jovem['idade']}")
print(f"Média salarial dos adultos empregados: R$ {media_salarial:.2f}")
print(f"Entre os adultos desempregados, há mais: {mais_desempregados}")
print(f"Percentual de crianças: {percentual_criancas:.1f}%")
