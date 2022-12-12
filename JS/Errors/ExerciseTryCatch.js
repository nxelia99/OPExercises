
const myFunction = val => {
    if(val === 4){ 
        return val
    }
    throw new Error('The value must be 4')

}

console.log(myFunction(4))

try{
    console.log("Everything's correct")
    const double = myFunction(4)
    console.log(myFunction(3)) //error
    console.log(double)
} catch(e){
    console.error(`E's value is: ${e}`) //it's going to specify the error
    console.log("ERROR")
} finally{
    console.log("It's going to execute always")
}
