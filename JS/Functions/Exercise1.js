// function that returns always true
function empty () {
    return true
}

console.log(empty())

// async function

async function sleep() {
    return setTimeout(() => console.log("I'm a promise"), 5000);
}

sleep()

// generator function

function* evenNumbers(){
    let number = 0;
    while(true){
        yield number += 2

        if(number === 12){
            return number
        }
    }
}

const gen = evenNumbers()

console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
