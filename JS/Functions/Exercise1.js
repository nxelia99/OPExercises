// function that returns always true
function empty () {
    return true
}

console.log(empty())

// async function

function timeout(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}
async function sleep() {
    await timeout(5000);
    return console.log("I'm a promise");
}

sleep()

// generator function

function* evenNumbers(){
    let number = 1;
    while(true){
        number++
        yield number++

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
