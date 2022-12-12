const mod = require("./modules.js") //variable to call the functions from modules

const fact = mod.factorial(4)
const add = mod.add(4,5)

const {factorial} = mod //easier method for calling the function
const factorial3 = factorial(3)
console.log(factorial3)

console.log(fact, add)