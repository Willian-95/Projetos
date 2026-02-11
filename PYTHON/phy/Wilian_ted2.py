valor_hora = 25.87
contador = 0
total_folha = 0
n_funcionarios = int(input("Digite o número de funcionários: "))

while contador < n_funcionarios:
    print(f"Funcionário: {contador + 1}")
   
    numero_matricula = input("Informe o número da matrícula: ")
    nome = input("Informe seu nome: ").upper()
    tempo_servico = int(input("Informe seu tempo de serviço (anos): "))
    horas_tab_semana = float(input("Informe suas horas trabalhadas na semana: "))

    sb = horas_tab_semana * valor_hora * 4.5  

    
    if tempo_servico < 5:
        adicional = sb * 0.01
    elif tempo_servico <= 15:
        adicional = sb * 0.02
    else:
        adicional = sb * 0.035

    inss = sb * 0.085  

    
    if sb > 5830.85:
        irpf = sb * 0.275
    elif sb > 4688.85:
        irpf = sb * 0.225
    elif sb > 3533.31:
        irpf = sb * 0.15
    elif sb > 3036.00:
        irpf = sb * 0.075
    else:
        irpf = 0

    
    vencimento = sb + adicional
    desconto = inss + irpf
    liquido = vencimento - desconto
    total_folha += liquido

   
    print("\nContracheque do funcionário:")
    print(f"Número matrícula: {numero_matricula}")
    print(f"Nome: {nome}")
    print(f"Salário bruto: R$ {sb:.2f}")
    print(f"Adicional: R$ {adicional:.2f}")
    print(f"INSS: R$ {inss:.2f}")
    print(f"IRPF: R$ {irpf:.2f}")
    print(f"Vencimentos: R$ {vencimento:.2f}")
    print(f"Descontos: R$ {desconto:.2f}")
    print(f"Salário líquido: R$ {liquido:.2f}\n")

    contador += 1


media = total_folha / n_funcionarios
print(f"Total da folha de pagamento: R$ {total_folha:.2f}")
print(f"Média salarial: R$ {media:.2f}")
