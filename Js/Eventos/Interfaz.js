const img = document.querySelector(".img");

img.addEventListener("error", () => {
    console.log("error");
});

addEventListener("load", () => {
    console.log("load");
});

addEventListener("beforeunload", () => {
    console.log("beforeunload");
});

addEventListener("resize", () => {
    console.log("resize");
});

addEventListener("scroll", () => {
    console.log("scroll");
});

const input = document.querySelector(".input");

input.addEventListener("select", (e) => {
    console.log(e.target.selettionStart, e.target.selectionEnd);
});
