package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String body(){
        return "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "</br>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +
                    "<body>" +
                        "<form action='/formResults/{name}/{lang1}/{l1ng2}/{lang3}'>" +
                            "<h2>Name: <input type='text' name='name'></h2>" +
                            "<table>" +
                                "<tr>" +
                                    "<th>---My Favorite Language---</th>" +
                                    "<th>---My 2nd Favorite Language---</th>" +
                                    "<th>---My 3rd Favorite Language---</th>" +
                                "</tr>" +
                                "<tr>" +
                                    "<td>" +
                                        "<select name='lang1'>" +
                                        "<option value='Java'>Java</option>" +
                                        "<option value='JavaScript'>JavaScript</option>" +
                                        "<option value='Python'>Python</option>" +
                                        "</select>" +
                                    "</td>" +
                                    "<td>" +
                                        "<select name='lang2'>" +
                                        "<option value='Java'>Java</option>" +
                                        "<option value='JavaScript'>JavaScript</option>" +
                                        "<option value='Python'>Python</option>" +
                                        "</select>" +
                                    "</td>" +
                                    "<td>" +
                                        "<select name='lang3'>" +
                                        "<option value='Java'>Java</option>" +
                                        "<option value='JavaScript'>JavaScript</option>" +
                                        "<option value='Python'>Python</option>" +
                                        "</select>" +
                                    "</td>" +
                                "</tr>" +
                            "</table>" +
                            "</br>" +
                            "<input type='submit'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("formResults")
    @ResponseBody
    public String emptyForm(){
        return "No data yet.";
    }

    @GetMapping("formResults/{name}/{lang1}/{l1ng2}/{lang3}")
    @ResponseBody
    public String form2(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                    "<body>" +
                        "<h1>"+name+"</h1>" +
                        "<h2><ol>" +
                            "<li>"+lang1+"</li></br>" +
                            "<li>"+lang2+"</li></br>" +
                            "<li>"+lang3+"</li></br>" +
                        "<h2><ol>" +
                    "</body>" +
                "</html>";
    }

}
