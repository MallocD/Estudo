//Utilizando Array
var time= []
time[0] = new Date()
time[1] =time[0].getHours()
time[2] = time[0].getMinutes()

var res = document.getElementById("hora")
var im= document.getElementById("foto")

if(time[1]<6){
    res.innerHTML = `<P><strong>Boa Madrugada</strong> agora são ${time[1]}:${time[2]} da madrugada</p> `
    im.src = 'madu.png'
    document.body.style.background = '#758997f8'
} else if(time[1]<12){
    res.innerHTML = `<p><strong>Bom dia</strong> agora são ${time[1]}:${time[2]} da manhã</p>`
    im.src = 'dia.png'
    document.body.style.background=' #f7cf64'
}else if(time[1]<18){
    res.innerHTML= `<p><strong>Boa Tarde</strong> agora são ${time[1]}:${time[2]} da tarde</p>`
    im.src = 'tarde.png'
    document.body.style.background= '#ffd000'
} else {
    res.innerHTML= `<p><strong>Boa Noite</strong> agora são ${time[1]}:${time[2]} da noite </p>`
    im.src= 'noite.png'
   document.body.style.background= '#252f50'
    
    
}
/*Maneira utilizando somente váriaveis
var agora = new Date()
var hora =agora.getHours()
var min = agora.getMinutes()

var res = document.getElementById("hora")
var im= document.getElementById("foto")

if(hora<6){
    res.innerHTML = `<P><strong>Boa Madrugada</strong> agora são ${hora}:${min} da madrugada</p> `
    im.src = 'madu.png'
    document.body.style.background = '#758997f8'
} else if(hora<12){
    res.innerHTML = `<p><strong>Bom dia</strong> agora são ${hora}:${min} da manhã</p>`
    im.src = 'dia.png'
    document.body.style.background=' #f7cf64'
}else if(hora<18){
    res.innerHTML= `<p><strong>Boa Tarde</strong> agora são ${hora}:${min} da tarde</p>`
    im.src = 'tarde.png'
    document.body.style.background= '#ffd000'
} else {
    res.innerHTML= `<p><strong>Boa Noite</strong> agora são ${hora}:${min} da noite </p>`
    im.src= 'noite.png'
   document.body.style.background= '#252f50'}