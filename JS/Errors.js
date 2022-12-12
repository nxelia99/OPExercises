//errors

const myFunction = val => {
    if(typeof val === 'number'){ 
        return 2 * val
    }
    throw new Error('The value must be of type number')

}

console.log(myFunction(3))

//try and catch 
// try {code I want to execute} catch{in case the try code doesn't work}

try{
    console.log("It's executing correctly")
    const double = myFunction(4)
    console.log(doublee) //it's going to throw an error
    console.log(double)
} catch(e){
    console.error(`E's value is: ${e}`) //it's going to specify the error
    console.log("ERROR")
} finally{
    console.log("It's going to execute always")
}

// Types of errors: InternalError, SyntaxError, TypeError, RangeError and ReferenceError
