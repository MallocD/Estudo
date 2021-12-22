    var agora = new Date()
    var data = agora.getFullYear()
    var sx = document.getElementsByName("rx")
    


function verifica(){

var res= document.getElementById("res")
var ano = document.getElementById("ano")
var idade = data-Number(ano.value);
var ida = idade.toString();
var img = document.createElement('img')
img.setAttribute('id','foto')

//var img = document.getElementById("foto")


if(ano.value.length==0 || ano.value>data){
    window.alert("Verifique os dados e tente novamente")
}
else if(idade<12){
        if(sx[0].checked){gênero = " um garoto",img.setAttribute('src','garoto.jpg')}
        else { gênero = " uma garota",img.setAttribute('src','garota.jpg')}
        
res.innerHTML = `<P>Detectamos ${gênero} com ${ida} anos<p>`
    
}else if(idade<16){
        if(sx[0].checked){g = "um",img.src="adom.jpg" }
        else { g = "uma", img.src="adof.jpg"}
        
res.innerHTML=`<p>Detectamos ${g} adolescente com ${ida} anos</p>`

}else if(idade<25){
        if(sx[0].checked){g = "um", img.src = "jovem.jpg"}
        else { g = "uma", img.src= "jovef.jpg"}

res.innerHTML= `<p>Detectamos ${g} jovem com ${ida} anos</p>`
    

}else if(idade<55){
        if(sx[0].checked){g = "um homem", img.src = "adulto.jpg"}
        else { g = "uma Mulher",img.src = "adulta.jpg"}

res.innerHTML = `<p>Detectamos ${g} com ${ida} anos</p>`

}else{
    if(sx[0].checked){g="um senhor", img.src = "senhor.jpg"}
    else{g="uma senhora", img.src="senhora.jpg"}

res.innerHTML= `<p> Detectamos ${g} com ${ida} anos</p>`
}
res.style.textAlign = 'center'
res.appendChild(img)
}
