//Crea un nuevo fichero JS que contenga las siguientes líneas

//- Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia 
//de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])

function fibonacci(num){
    fr = [0, 1] //frequency
    if (num <= 1){return console.log(0)};
    if (num === 2){return console.log(...fr)};

    if (num > 2){
        for(let i = 1; i != num; i++){ //executes until i is = num
            fr.push(fr[fr.length-1] + fr[fr.length-2]) //adds to the array the numbers
        }
        fr.shift() //eliminates the 0 at the beginning
        console.log(fr)
    }
}

fibonacci(6)
