

        function calcular(){
                var num = Number(document.getElementById("num").value)
                var tab = document.getElementById('tab')
                
                if(num==0){
                window.alert("Please enter a number")
                }else{
                c=1
                tab.innerHTML = " "
                     do {
                        let item= document.createElement('option') //Criando um option dinamicamente
                        item.text= `${num} x ${c} = ${num*c}`
                        c++ 
                        tab.appendChild(item) } //Utilizado para adicionar um emelento filho que no caso foi do creatElement
                        while(c<=10)
                        
                }
                

        }
