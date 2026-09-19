# IT Help Desk Ticketing System
## Requirements Specification – First Iteration

**Course:** COSC 369 – Software Engineering I  
**Student:** Nzube Onwere

## 1. Customer Statement of Requirements

The goal of this IT Help Desk Ticketing System is to provide an organized way for employees to report technical issues and for IT technicians to manage those issues until they are resolved. Instead of employees having to report technical problems through emails or phone calls, the system will provide one central place where problems can be submitted, recorded, and tracked as support tickets.

The system will have two main types of users: employees and IT technicians. Employees will be able to log into the system, create a support ticket, describe the technical issue they are experiencing, select a category and priority level, and track the status of the ticket they submitted. IT technicians will have additional access that allows them to view submitted tickets, search and filter tickets, assign tickets, update ticket information, change the status of a ticket, and mark an issue as resolved.

Each support ticket will contain information such as a ticket ID, title, description of the problem, category, priority level, current status, and date of creation. The main ticket statuses will be Open, In Progress, and Resolved.

For the first iteration of the project, the main focus will be on the basic functions needed for the ticketing system to work. This includes allowing users to log in, employees to create and track tickets, IT technicians to manage those tickets, and storing the necessary user and ticket information in a database.


## 2. Requirements Specification

The requirements for the IT Help Desk Ticketing System are divided into functional and non-functional requirements. The functional requirements describe what the system should be able to do, while the non-functional requirements describe how the system should operate.

### 2.1 Functional Requirements

- **FR-01:** The system should allow employees and IT technicians to log in using their registered account information.
- **FR-02:** The system should identify whether the logged-in user is an employee or an IT technician and provide access to the appropriate functions.
- **FR-03:** Employees should be able to create a support ticket by entering a title, description of the problem, category, and priority level.
- **FR-04:** The system should generate a unique ticket ID and record the date when a new ticket is created.
- **FR-05:** A newly created support ticket should automatically have a status of Open.
- **FR-06:** Employees should be able to view the tickets they have submitted and track their current status.
- **FR-07:** IT technicians should be able to view support tickets submitted by employees.
- **FR-08:** IT technicians should be able to search and filter support tickets by information such as status, category, and priority.
- **FR-09:** IT technicians should be able to assign support tickets to a technician.
- **FR-10:** IT technicians should be able to update ticket information and change a ticket's status to Open, In Progress, or Resolved.
- **FR-11:** The system should store and retrieve user and support ticket information from the database.
- **FR-12:** Employees and IT technicians should be able to log out of the system.

### 2.2 Non-Functional Requirements

- **NFR-01:** The system should have a clear and easy-to-use interface so that employees and IT technicians can navigate the application without difficulty.
- **NFR-02:** The system should restrict users to the functions that are available for their assigned role.
- **NFR-03:** User passwords should be stored securely and should not be stored as plain text.
- **NFR-04:** The system should check the information entered into a support ticket to make sure required information is provided before the ticket is submitted.
- **NFR-05:** The system should prevent users from making changes to information that they are not authorized to modify.
- **NFR-06:** The system should provide a message to the user when a ticket is successfully created or updated, or when an error occurs.
- **NFR-07:** The system should be designed so that additional features can be added in future versions without having to completely redesign the application.
- **NFR-08:** The system should maintain accurate user and ticket information when information is stored or updated in the database.


## 3. Data and Storage Blueprint

### 3.1 Data Input

The IT Help Desk Ticketing System will mainly receive data through manual user input. Employees will enter information into the system when they log in and create support tickets. When creating a ticket, the employee will provide information such as the title of the issue, a description of the problem, the category, and the priority level.

The system will automatically generate additional information for each ticket, including a unique ticket ID, the date the ticket was created, and an initial status of Open. The ticket will also be connected to the employee who submitted it.

IT technicians will also provide input when they manage support tickets. They will be able to assign tickets, update ticket information, and change the status of a ticket as the issue is being worked on.

For the first iteration of the project, the system will use manual user input and will not require an external dataset or information from another website.

### 3.2 Database and Storage

The IT Help Desk Ticketing System will use MySQL as its database. MySQL will be used to store and organize information about the users of the system and the support tickets that are created.

The database will initially contain two main tables: Users and Tickets.

#### Users Table

- `user_id` – Unique ID for each user
- `name` – Full name of the user
- `email` – Email address used by the user
- `password_hash` – Securely stored version of the user's password
- `role` – Identifies whether the user is an Employee or IT Technician

#### Tickets Table

- `ticket_id` – Unique ID for each support ticket
- `user_id` – Identifies the employee who submitted the ticket
- `title` – Title of the technical issue
- `description` – Description of the problem
- `category` – Category of the technical issue
- `priority` – Priority level of the ticket
- `status` – Current status of the ticket: Open, In Progress, or Resolved
- `date_created` – Date the ticket was created
- `assigned_technician_id` – Identifies the IT technician assigned to the ticket

The Users and Tickets tables will be connected using the user IDs. This will allow the system to identify which employee created a ticket and which IT technician is assigned to it.

### 3.3 Database Connectivity

The application will use Java as its primary programming language and MySQL for storing the application's data. Java will communicate with the MySQL database using JDBC (Java Database Connectivity). JDBC will allow the application to send and retrieve information from the database when users create, view, or update support tickets.

Git and GitHub will continue to be used for version control, project documentation, and tracking the development of the application.  
