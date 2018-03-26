create table Enrollment (
    ssn char(9),
    courseId char(5),
    dateRegistered date,
    grade char(1),
    primary key (ssn, courseId),
    foreign key (ssn) references Student(ssn),
    foreign key (courseId) references Course(courseId)
);

create table Course (
    courseId char(5),
    subjectId char(4) not null,
    courseNumber integer,
    title varchar(50) not null,
    numOfCredits integer,
    primary key (courseId)
);

create table Student (
    ssn char(9),
    firstName varchar(25),
    mi char(1),
    lastName varchar(25),
    birthDate date,
    street varchar(25),
    phone char(11),
    zipCode char(5),
    deptId char(4),
    primary key (ssn)
); 

insert into Course (courseId, subjectId, courseNumber, title, numOfCredits)
    values ('11113', 'CSCI', 3720, 'Database Systems', 3);

insert into Course (courseId, subjectId, courseNumber, title, numOfCredits)
    values ('IT105', 'INT', 105, 'Programming II', 3);

insert into Student (ssn, firstname, mi, lastname, birthdate, street, phone, zipcode, deptID)
    values ('0500055', 'Pongthanat', 'B', 'Soontornpornlert', null, null, '0885445454', '10120', null);

insert into ENROLLMENT (ssn, COURSEID, DATEREGISTERED, GRADE)
    values ('0500055', 'IT105', '1999-03-29', 'Z');

update ENROLLMENT
set grade = 'A'
where ssn = '0500055' and COURSEID = 'IT105';

delete from ENROLLMENT
where ssn = '0500055' and COURSEID = 'IT105';

SELECT * from COURSE
