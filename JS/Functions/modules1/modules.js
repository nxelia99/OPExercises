//declare the functions

function add(a, b){
    return a + b
}

function multiply(a, b){
    return a * b
}

function factorial(a){
    let factorial = 1
    for (let i=1; i <=a; i++){
        factorial *= i;
    } return factorial
}

//declares the functions we want to export
module.exports = {
    add, factorial,multiply
}