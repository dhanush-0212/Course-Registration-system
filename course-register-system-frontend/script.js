function showcourses(){
    fetch("http://localhost:8080/courses")
    .then((response)=>response.json())
    .then((courses)=>{
        const datatable=document.getElementById("coursetable")

        courses.forEach(course => {

            var row=`<tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.trainer}</td>
                <td>${course.durationInWeeks}</td>
                </tr>`

            datatable.innerHTML+=row;
        });
        
    });
}

function enrolledstudents(){
    fetch("http://localhost:8080/courses/enrolled")
    .then((response)=>response.json())
    .then((students)=>{
        const enrolledlist=document.getElementById("enrolled")

        students.forEach(student => {

            var row=`<tr>
                <td>${student.name}</td>
                <td>${student.email}</td>
                <td>${student.coursename}</td>
                </tr>`

            enrolledlist.innerHTML+=row;
        });
        
    });
}