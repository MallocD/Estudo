
var res= document.getElementById("res")

function contar(){

        var ini = Number(document.getElementById('ini').value)
        var fim = Number(document.getElementById('fim').value)
        var pass = Number(document.getElementById('passo').value)

        //res.innerText = `Inicio ${ini} Fim ${fim} passo ${pass}`

        
        var s = ' '

        if (fim==0 ){
                window.alert("A coluna fim deve ser preenchida")
        }
       else if (passo.value==0){
                window.alert('Passo inválido considerando passo 1')
                for(c=ini;c<=fim;c++){
                        ini+=c;
                        s += c + " "
                        
                       
                }  res.innerText = `${s}`
        } else {
       
                for(c=ini;c<=fim;c+=pass){
                ini+=c
                s += c + " "
                
               
                }  res.innerText = `${s}`
        }
}