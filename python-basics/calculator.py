numero1 = 0
numero2 = 0
resultado = 0
operacao = ''

while True:
    numero1 = float(input("Digite o primeiro número: "))
    operacao = input("Digite a operação matemática a ser feita: ")
    numero2 = float(input("Digite o segundo número: "))

    if operacao == "+":
        resultado = numero1 + numero2
        break
    elif operacao == "-":
        resultado = numero1 - numero2
        break
    elif operacao == "*":
        resultado = numero1 * numero2
        break
    elif operacao == "/":
        resultado = numero1 / numero2
        break
    else:
        print("Operação não reconhecida!")
print("{} {} {} = {}".format(numero1, operacao, numero2, resultado))   
