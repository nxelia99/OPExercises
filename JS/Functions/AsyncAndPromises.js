// async functions and promises

function myAsync(){
    //calls an external database
}

const myPromise = new Promise((resolve, reject) => {
    const i = Math.floor(Math.random() * 2) //gets a plain random number 
    if (i !== 0){ //if the condition in this part is true
        resolve()
    } else{
        reject() //if it's not true
    }

})

myPromise
    .then(() => console.log("Succesful execution"))
    .catch(() => console.log("ERROR"))
    .finally(() => console.log('Always executed'))
