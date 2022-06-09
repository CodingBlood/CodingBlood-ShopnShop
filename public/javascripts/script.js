const hamburger = document.querySelector(".hamburger");
const navMenu = document.querySelector(".nav-menu");

hamburger.addEventListener("click", mobileMenu);

function mobileMenu() {
    hamburger.classList.toggle("active");
    navMenu.classList.toggle("active");
}


function delay(delayInms) {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve(2);
        }, delayInms);
    });
}
async function a(){
    let delayres = await delay(400);
    window.location='/home';
}
// userHasScrolled = false;
// window.onscroll = function (e)
// {
//     userHasScrolled = true;
// }
// if(userHasScrolled)
// {
//     location.assign('/home');
// }

