//JSON.stringify -> converts object/array into string
//JSON.parse -> converts object array though stringify into a js object

// localstorage
localStorage.setItem("name", "Kai")
//console.log(localStorage.getItem("name"))
localStorage.setItem("person", JSON.stringify({name: "Jojos", age:23}))
//console.log(JSON.parse(localStorage.getItem("person")))

localStorage.removeItem("name")

//sessionstorage

sessionStorage.setItem("session-name", "123")

//cookies

document.cookie = "namecookie=KaiCookie; expires=" + new Date(2023, 0, 1).toUTCString()
console.log(document.cookie)