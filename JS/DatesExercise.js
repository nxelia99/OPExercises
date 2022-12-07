const today = new Date("December, 07, 2022")
console.log(today)

const mybirthdate = new Date("September, 16, 1999")
console.log(mybirthdate)

console.log(today > mybirthdate)

const birthDay = mybirthdate.getDate()
const birthMonth = mybirthdate.getMonth() + 1
const birthYear = mybirthdate.getFullYear()

console.log(birthDay + '/' + birthMonth + '/' + birthYear)
