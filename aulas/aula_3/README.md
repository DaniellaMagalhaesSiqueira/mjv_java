## Aula 3:
- Código gerado na atividade em grupo:
...
programa {
funcao inicio() {
        real saldoAtual = 10.0
        real valorSolicitado = 0.0
        real chequeEspecial = 20.0
        cadeia resposta = "N"
        
        escreva("informe o valor desejado \n")
        
        leia(valorSolicitado)
        
        se(valorSolicitado > saldoAtual){

        	se(valorSolicitado > saldoAtual + chequeEspecial){
        		
            escreva("saldo insuficiente!\n Você tem cheque especial de ", chequeEspecial)
            
        	}senao{
        		escreva("Saldo insuficiente! Deseja usar o cheque especial?")
        		leia(resposta)
        		se(resposta == "S" ou resposta =="s"){
        			chequeEspecial = (saldoAtual + chequeEspecial) - valorSolicitado
        			saldoAtual = 0.0
        		}
        	}
            
        
        }senao{
        
            saldoAtual = saldoAtual - valorSolicitado
            escreva("saque realizado com sucesso!\n")        
        }
          escreva("Seu novo saldo é ", saldoAtual, "\n")
          escreva("Seu cheque especial é de ", chequeEspecial)
}
}
...
