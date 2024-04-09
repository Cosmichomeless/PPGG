const input = document.querySelector("input");

input.addEventListener("keydown", (e) => {
    console.log("keydown", e.key);
});
input.addEventListener("keypress", (e) => {
    console.log("keypress", e.key);
});
input.addEventListener("keyup", (e) => {
    console.log("keyup", e.key);
});
