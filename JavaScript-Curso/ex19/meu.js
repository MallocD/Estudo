
function adicionar(){
    var num = []
    let item = document.createElement('option')
    var tab = document.getElementById('tab')

    num[0] = Number(document.getElementById("num").value)
    
    item.text = `O valor ${num[0]} foi adicionado`
    tab.appendChild(item)  


}

function finaliza(){
    adicionar++
    var res = document.getElementById("res")

    res.innerHTML = ` <p>Ao todo, temos ${adicionar} números cadrastrados</p>`
   /* res.innerHTML = ` <p>O mair valor adicionado foi ${}</p>`
    res.innerHTML = `<P> O menor valor informado foi ${}</P>`
    res.innerHTML = `<P>Somando todos os valores, temos ${}</P>`
    res.innerHTML = `<P> A média dos valores adicionados é igual a ${}</p>`*/

} 
