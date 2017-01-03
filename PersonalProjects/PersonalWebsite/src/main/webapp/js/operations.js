/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function (){
    
    var content = $("#content");
    
    $("#sg").click(function (event) {
      content.empty();
      content.append("sg placeholder text");
      content.append("<a href='http://www.thesoftwareguild.com/about/'>Click Here</a>");
    });
    
    $("#ghub").click(function (event) {
      content.empty();
      content.append("Follow the link below to view my github repository. This is my personal use repos. It is not necessarily \n\
        meant to be a portfolio. However, I am proud of a lot of the work inside and I would be thrilled for people to look through it. \n\
        The 'MyProjects' folder is all of assignments that I completed during my time at the software guild. It has a combination of\n\
         java console applications and full-stack web applications with databases. The 'Software_Guild_Resources' folder is a \n\
        collection of class materials for me to look back on. NONE OF THE MATERIAL IN THIS FOLDER IS MY OWN CODE. The code for this website is also \n\
        available too!");
      content.append("<a href='https://github.com/ChristopherOnGitHub'> Click Here To View My GitHub Profile</a>");
    });
    
    $("#lin").click(function (event) {
      content.empty();
      content.append("My linkedIn accountg is available to view");
      content.append("<a href='https://www.linkedin.com/in/christopher-floyd-55a658130'> Here</a>");
      content.append(". You can find more information about myself along with all of the information\n\
         on this website. Please do not hesitate to send me a message or send me a connection request.");
    });
    
    $("#resume").click(function (event) {
      content.empty();
      content.append("<img src='img/Resume1.jpg'>");
      content.append("<img src='img/resume2.jpg'>");
    });
});


