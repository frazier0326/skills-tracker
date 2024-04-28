package org.launcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String homePage() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<h2> List of Skills </h2>" +
                "<ol>" +
                "<p>Click <a href='/form'>here</a> to select your favorite.</p>" +
                "<li>Java </li>" +
                "<li>JavaScript </li>" +
                "<li>Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName' /><br />" +
                "<label>My favorite language:</label>" +
                "<select name='fave1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<label>My second favorite language:</label>" +
                "<select name='fave2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<label>My third favorite language:</label>" +
                "<select name='fave3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("/form")
    public String processedSkillsForm(@RequestParam String userName, String fave1, String fave2, String fave3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName +"</h1>" +
                "<h3>Favorite Languages</h3>" +
                "<ol>" +
                "<li>" + fave1 + "</li>" +
                "<li>" + fave2 + "</li>" +
                "<li>" + fave3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
