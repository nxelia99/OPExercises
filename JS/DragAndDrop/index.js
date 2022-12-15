const paragraphs = document.querySelectorAll(".paragraph") //select the paragraph
const sections = document.querySelectorAll(".section")


paragraphs.forEach(paragraph => { //each paragraph will have "dragging" class when it's dragged
    paragraph.addEventListener("dragstart", event =>{
        console.log("Drag start")
        paragraph.classList.add("dragging")
        event.dataTransfer.setData("id", paragraph.id) //sets the data that we want to transfer
    })

    paragraph.addEventListener("dragend", () =>{ //removes "dragging" class when the dragging ends
        console.log("Drag end")
        paragraph.classList.remove("dragging")
    })
    
})

sections.forEach(section => {
    section.addEventListener("dragover", event =>{
        event.preventDefault()

    })
    section.addEventListener("drop", event =>{
        console.log("dropped")
        const id_paragraph = event.dataTransfer.getData("id") //gets the transfered data
        const paragraph = document.getElementById(id_paragraph)
        section.appendChild(paragraph) //adds the dragged pargraph to the section
    })
})




