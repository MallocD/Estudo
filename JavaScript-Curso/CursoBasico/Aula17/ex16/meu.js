

function contar(){

    var ini = Number(document.getElementById('ini').value)
    var fim = Number(document.getElementById('fim').value)
    var pass = Number(document.getElementById('passo').value)
    var res= document.getElementById("res")

    //res.innerText = `Inicio ${ini} Fim ${fim} passo ${pass}`

    
    var s = ' '

    if (fim==0 ){
      window.alert("A coluna fim deve ser preenchida")//Condição em que se o valor de fim for = 0 o código irá barrar e pedir para que preencha um valor
    }
    else if (passo.value==0){ 
      window.alert('Passo inválido! Considerando passo 1')//Condição aninhada em que se o valor de passo for = 0 , o código automaticamente irá atribuir o valor = 1
      
            if(ini>fim) {
             for(c=ini;c>=fim;c--){//Condição aninhada para que o valor do ínicio seja decrementado pelo contador caso valor de passo seja =0
                    s += c + "\u{1F449}"
                    res.innerHTML = `Contagem <Strong> Descrescente</strong>: ${s}1\u{1F6AC}`
            }
          } else {
             for(c=ini;c<=fim;c++){//Condição aninhada para que o valor do ínicio seja incrementado pelo contador caso valor passo seja =0
                    s += c + "\u{1F449}"
                    res.innerHTML = `Contagem <Strong> Crescente</strong>: ${s}1\u{1F6AC}`
            }   
          }   

    } else {//Condição para decrementação, caso o valor do ínicio da contagem seja maior que o valor do final, assim o contador irá decrementar

        if(ini>= fim){
             for(c=ini;c>=fim;c-=pass){
                    s += c + "\u{1F449}"
                    res.innerHTML = `Contagem <strong>Decrescente</strong>:${s}\u{1F6AC}`
                    }
                  } else  {//Condição para incrementação. quando nenhuma das condições a cima forem atendidas irá cair nessa fazendo assim incrementação ao contador
                            for(c=ini;c<=fim;c+=pass){
                            s += c + "\u{1F449}"
                            res.innerHTML = `Contagem <strong> Crescente</strong> :${s}\u{1F6AC}`//Adicionar emojis \u{Código hexadecimal do emoji
          }
        }         
      }
    }
