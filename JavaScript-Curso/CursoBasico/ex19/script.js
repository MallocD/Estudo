let num = document.getElementById("num")
let res = document.getElementById("res")
let tab = document.getElementById("tab")
let val = []

function isNumero(n){

        if(Number(n) >=1 && Number(n)<= 100){
                 return true
        } else {
                 return false
        }
}
function inLista(n,l){
        if(l.indexOf(Number(n)) == -1){
                        return true
                } else{
                        return false
                }
}
function adicionar(){
         if(isNumero(num.value) && inLista(num.value, val)){//oLAAA
                val.push(Number(num.value))//Adicionar o valor a array (Lista)
                let item = document.createElement('option')
                item.text = `O valor ${(num).value} foi adicionado`
                tab.appendChild(item)
                res.innerHTML = ''//Vai servir para limpar a DIV toda vez que um valor for adicionado
        }else {
                window.alert("Valor inválido ou já encontrado na lista")
        }
        num.value = ''//Serve para limpar a caixa input, atribuindo um valor vazio
        num.focus()//Volta o foco da escrita para a caixa input
}
function finaliza(){
        if (val.length==00){
                window.alert("Adicione valores antes de finalizar")
        }else{
                var vl= []
                vl[0] = val.length//Quantidade de valores adicionados
                vl[1] = val[0]//Maior número começando com o maior número como o primeiro a ser adicionado na posição 0
                vl[2] = val[0]//Menor número começando com o menor como o primeiro a ser adicionado na posição 0
                vl[3] = 0//Soma de todos os valores
                        for(pos in val){
                                vl[3]+=val[pos]//Calcular a soma de todos os valores, passando por todos os valores adicionados e somando a ele mesmo
                        }
                        for(pos in val){
                                if(val[pos]>vl[1]){//Se o valor da posição que o "for" está passando for maior que o valor atríbuido no momento ele irá passar a ser esse valor nas próximas repetições
                                        vl[1]= val[pos]

                                } if (val[pos] < vl[2]){//Se o valor da posição que o "for" está passando for menor que o valor atríbuido no momento ele irá passar a ser esse valor nas próximas repetições
                                        vl[2] = val[pos]
                                }
                        }
                vl[4] = vl[3]/vl[0]// A média de todos os valores somados entre si
                res.innerHTML= " "
                res.innerHTML += `<p>A quantidade de valores adicionados é : <strong>${vl[0]}</strong></p>`
                res.innerHTML +=  `<P> Maior valor é : <strong>${vl[1]}</strong></p>`
                res.innerHTML += `<P> Menor valor é : <strong>${vl[2]}</strong></p>`
                res.innerHTML += `<p> A soma de todos os valores é : <strong>${vl[3]}</strong></p>`
                res.innerHTML += `<P> A média dos valores é : <strong>${vl[4]}</strong>`
        }
}