<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
    <title>Survey Form</title>
     <style>
       nav ul{
          list-style-type: none;
            padding: 0;
       }
        nav a {
            text-decoration: none;
        }

        .personal__details {
           
            padding: 10px;
            border-radius: 5px;
        }

         .form p {
            margin: 0;
            font-size: 14px; 
        }

        .form input[type="text"] {
            width: calc(100% - 20px);
            padding: 5px;
            border: 1px solid lightblue;
            border-radius: 3px;
            font-size: 14px; 
        }

       
        .form input[type="text"]:valid {
           
        }

        .move__right {
            float: right;
            margin-left: 10px;
        }

        .heading__ {
            width: 75%;
            margin: auto;
        }

        table {
            border-collapse: collapse;
            width: 75%;
            height: 20px;
            margin: auto;
            background-color: white;
        }

        th, td {
            border: 1px solid lightblue;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }

        .details {
            width: 50%;
            margin: auto;
            text-align: center;
        }

        .form {
            display: inline-block;
            text-align: left;
        }

        .submit__button {
            text-align: center;
        }

        input[type="radio"] {
            border: 1px solid green; 
            margin: 0;
        }

        .error-message {
            display: none;
            color: red;
        }

        
        .submit__button button {
            padding: 10px 20px; 
            background-color: skyblue; 
            border: none;
            border-radius: 5px;
            font-size: 14px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .submit__button button:hover {
            background-color: #87ceeb;
        }
        </style>

</head>
<body>
     <div class="nav__header">
            <div class="nav__">
                <nav>
                    <ul>
                        <li><a href="" style="color:black;">_Survey</a></li>
                         <li class="move__right"><a href="Results" style="color:black">VIEW SURVEY RESULTS</a></li>
                        <li class="move__right"><a href=""  style="color:skyblue">FILL OUT SURVEY</a></li>
                      
                    </ul>
                </nav>
            </div>
        </div>


    
    
    
     <%
            ArrayList<String> question = (ArrayList<String>) session.getAttribute("questions");

            if (question == null || question.isEmpty()) {
               
            } else {
               
            }
        %>

    <form id="surveyForm" action="Update" method="POST" onsubmit="return validateForm()">
        
            <div class="heading__">
                <p>Personal Details:</p>
            </div>
            <div class="details">
                <div class="personal__details">
                    <div class="form">
                        <p>Full Name</p>
                        <input type="text" id="full_name" name="full_name" required>
                    </div>
                    <br>
                    <div class="form">
                        <p>Email</p>
                        <input type="text" id="email" name="email" required>
                    </div>
                    <br><!-- comment -->
                    <div class="form">
                        <p>Date of birth</p>
                        <input type="text" id="date_of_birth" name="date_of_birth" >
                    </div>
                    <br><!-- comment -->
                    <div class="form">
                        <p>Contact</p>
                        <input type="text" id="contact" name="contact" required>
                    </div>
                    <br>
                </div>
            </div>

            <br>
                      <div class="heading__">
    What is your favorite food?
    <label for="pizza">
        <input type="checkbox" id="pizza" name="selectedItems" value="Pizza"> Pizza
    </label>

    <label for="pasta">
        <input type="checkbox" id="pasta" name="selectedItems" value="Pasta" > Pasta
    </label>

    <label for="pap_and_wors">
        <input type="checkbox" id="pap_and_wors" name="selectedItems" value="Pap and Wors" > Pap and Wors
    </label>

    <label for="other">
        <input type="checkbox" id="other" name="selectedItems" value="Other" > Other
    </label>
    <br>
</div>

                <div class="heading__">
                    <p>Please rate your level of agreement on scale from 1 to 5, with 1 being "strongly agree" and 5 being "strongly disagree."</p>
                </div>
                <br>
                <div class="table__">

                    <table>
                        <tr>
                            <th>     </th><!-- comment -->
                            <th>Strongly agree</th>
                            <th>Agree</th><!-- comment -->
                            <th>Neutral</th><!-- comment -->
                            <th>Disagree</th><!-- comment -->
                            <th>Strongly Disagree</th>
                        </tr><!-- comment -->

                        <tr>
        <td><%= question.get(0) %></td>
        <td><input type="radio" id="opt1_0" name="opt_0" value="1"></td>
        <td><input type="radio" id="opt2_0" name="opt_0" value="2"></td>
        <td><input type="radio" id="opt3_0" name="opt_0" value="3"></td>
        <td><input type="radio" id="opt4_0" name="opt_0" value="4"></td>
        <td><input type="radio" id="opt5_0" name="opt_0" value="5"></td>
    </tr>
    <tr>
        <td><%= question.get(1) %></td>
        <td><input type="radio" id="opt1_1" name="opt_1" value="1"></td>
        <td><input type="radio" id="opt2_1" name="opt_1" value="2"></td>
        <td><input type="radio" id="opt3_1" name="opt_1" value="3"></td>
        <td><input type="radio" id="opt4_1" name="opt_1" value="4"></td>
        <td><input type="radio" id="opt5_1" name="opt_1" value="5"></td>
    </tr>
    <tr>
        <td><%= question.get(2) %></td>
        <td><input type="radio" id="opt1_2" name="opt_2" value="1"></td>
        <td><input type="radio" id="opt2_2" name="opt_2" value="2"></td>
        <td><input type="radio" id="opt3_2" name="opt_2" value="3"></td>
        <td><input type="radio" id="opt4_2" name="opt_2" value="4"></td>
        <td><input type="radio" id="opt5_2" name="opt_2" value="5"></td>
    </tr>
    <tr>
        <td><%= question.get(3) %></td>
        <td><input type="radio" id="opt1_3" name="opt_3" value="1"></td>
        <td><input type="radio" id="opt2_3" name="opt_3" value="2"></td>
        <td><input type="radio" id="opt3_3" name="opt_3" value="3"></td>
        <td><input type="radio" id="opt4_3" name="opt_3" value="4"></td>
        <td><input type="radio" id="opt5_3" name="opt_3" value="5"></td>
    </tr>
                    </table>
                    <br>
                    <div class="submit__button">
                        <button type="submit">Submit</button>
                    </div>
                </div>
            </div>
    </form>

    <script>
        function validateForm() {
            var form = document.getElementById('surveyForm');
            var radios = form.querySelectorAll('input[type="radio"]');
            var radioGroups = {};

            radios.forEach(function (radio) {
                if (!radioGroups[radio.name]) {
                    radioGroups[radio.name] = [];
                }
                radioGroups[radio.name].push(radio);
            });

            var isValid = true;

            for (var groupName in radioGroups) {
                var groupRadios = radioGroups[groupName];
                var isChecked = false;
                for (var i = 0; i < groupRadios.length; i++) {
                    if (groupRadios[i].checked) {
                        isChecked = true;
                        break;
                    }
                }
                if (!isChecked) {
                    var errorMessage = document.getElementById(groupName + '_error');
                    errorMessage.style.display = 'block';
                    isValid = false;
                } else {
                    var errorMessage = document.getElementById(groupName + '_error');
                    errorMessage.style.display = 'none';
                }
            }

            var dobInput = document.getElementById('date_of_birth');
            var dobValue = dobInput.value;
            var age = calculateAge(dobValue);
            if (age < 5 || age > 120) {
                alert('Age should be between 5 and 120 years.');
                isValid = false;
            }

            var requiredFields = ['full_name', 'email', 'date_of_birth', 'contact'];
            for (var i = 0; i < requiredFields.length; i++) {
                var field = document.getElementById(requiredFields[i]);
                if (field.value.trim() === '') {
                    alert('Please fill in all required fields.');
                    isValid = false;
                    break;
                }
            }

            return isValid;
        }

        function calculateAge(dateString) {
            var today = new Date();
            var birthDate = new Date(dateString);
            var age = today.getFullYear() - birthDate.getFullYear();
            var monthDiff = today.getMonth() - birthDate.getMonth();
            if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < birthDate.getDate())) {
                age--;
            }
            return age;
        }
    </script>
</body>
</html>
