const myname = "kai"
const myusername = "Cheryl"
const me = {name: myname, surname: myusername}

sessionStorage.setItem("me", JSON.stringify(me))
var obj = JSON.parse(sessionStorage.me);

localStorage.setItem("me", JSON.stringify(me))
var obj2 = JSON.parse(localStorage.me);

// cookie

document.cookie = "namecookie=KaiCookie; expires=" + new Date(2023, 0, 1).toUTCString()

