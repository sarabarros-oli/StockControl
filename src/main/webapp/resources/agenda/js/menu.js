/* Open submenu li ul */
document.querySelector(".menu li").addEventListener('hover', function(){
    $(this).children("ul").slideDown(100);
}, function(){
    $(this).children("ul").slideUp(100);
});

document.querySelectorAll("li.submenu>a").forEach((item) => {
        item.addEventListener('click', (function(){
            item.parentElement.classList.toggle("open");
        }));
    });

document.querySelector(".toggle-menu").addEventListener('click', function(){
    document.querySelector("aside").classList.add("open");
    document.querySelector("html").classList.add("no-scroll");
});
document.querySelector(".overlay").addEventListener('click', function(){
    document.querySelector("aside").classList.remove("open");
    document.querySelector("html").classList.remove("no-scroll");
});