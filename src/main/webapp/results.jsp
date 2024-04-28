<%@page import="za.ac.teamtech.survey.model.UserResults"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
            nav ul{
          list-style-type: none;
            padding: 0;
       }
        nav a {
            text-decoration: none;
        }
         .move__right {
            float: right;
            margin-left: 10px;
        }

        /* Center align content */
/*        body {
            text-align: center;
            margin: 0;  Remove default body margin 
            padding: 0;  Remove default body padding 
        }*/
        /* Style Survey and View Survey Results links */
/*        .nav__header {
            background-color: #333;
            color: #fff;
            padding: 10px;
        }
        .nav__ {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }
        nav a {
            text-decoration: none;
            color: inherit;
            padding: 8px 12px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        nav a:hover {
            background-color: #555;
        }*/
       
        .results {
            text-align: center;
        }
         .result-item {
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
    <div class="nav__header">
        <div class="nav__">
            <nav>
                <ul>
                    <li class="bolt"><a href="">_Survey</a></li>
                   <li class="move__right"><a href="Results" style="color:skyblue">VIEW SURVEY RESULTS</a></li>
                        <li class="move__right"><a href="TestConnection"  style="color:black">FILL OUT SURVEY</a></li>
                      
                </ul>
            </nav>
        </div>
    </div>

    <% UserResults results = (UserResults) session.getAttribute("results"); %>
    <br>
    <br>
    <div class="results">
        <div class="result-item">
            <p>Total number of surveys:                              <%= results.getTotal() %></p>
        </div>
        <div class="result-item">
            <p>Average Age: <%= results.getAvAge() %></p><!-- comment -->
        </div>
        <div class="result-item">
            <p>Oldest person who participated in survey: <%= results.getOldestPersonAge() %></p><!-- comment -->
        </div>
        <div class="result-item">
            <p>Youngest person who participated in survey: <%= results.getYoungPersonAge() %></p>
        </div>
        <br><!-- comment -->
        <div class="result-item">
            <p>Percentage of people who like pizza: <%= results.getPizzaAve() %></p>
        </div>
        <div class="result-item">
            <p>Percentage of people who like pasta: <%= results.getPastaAve() %></p><!-- comment -->
        </div>
        <div class="result-item">
            <p>Percentage of people who like pap and wors: <%= results.getPapAve() %></p><!-- comment -->
        </div>
        <br><!-- comment -->
        <div class="result-item">
            <p>People who like to watch movies: <%= results.getQ1() %></p>
        </div>
        <div class="result-item">
            <p>People who like to listen to radio: <%= results.getQ2() %></p><!-- comment -->
        </div>
        <div class="result-item">
            <p>People who like to eat out: <%= results.getQ3() %></p><!-- comment -->
        </div>
        <div class="result-item">
            <p>People who like to watch TV: <%= results.getQ4() %></p>
        </div>
    </div>
    <br>
</body>
</html>
