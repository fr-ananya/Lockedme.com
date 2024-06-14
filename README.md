# LockedMe Documentation
## Developer - Ananya Sharma

### 1. Specifications

#### Product Overview
The LockedMe File Management System is a Java-based console application designed to manage files within a specified directory. The application allows users to view, add, delete, and search for files. Additionally, it provides business operations for managing files in a user-friendly manner.

#### Capabilities
- **Display All Files**: Lists all files in the specified directory in ascending order.
- **Add a File**: Allows the user to add a new file to the directory.
- **Delete a File**: Enables the user to delete an existing file from the directory.
- **Search for a File**: Allows the user to search for a specific file in the directory.
- **Business Operations**: A submenu providing file management operations.

#### Appearance and User Interaction
- **Main Menu**: Displays the main options for the user to select.
- **File Operations Menu**: Provides options for adding, deleting, and searching files.
- **User Prompts**: Guides users through various operations with clear instructions.
- **Error Handling**: Catches and displays error messages for invalid inputs and exceptions.

### 2. Sprints Overview

#### Sprint 1: Setup and Basic Functionality
**Duration:** 5 days

##### Tasks:
- **Project Setup:**
  - Initialize the project repository on GitHub.
  - Set up the development environment in Eclipse.
  - Create the basic project structure with appropriate packages.
  - Configure build tools and dependencies (if any).

- **Implement Main Menu and Navigation:**
  - Create the main menu interface.
  - Provide navigation options for displaying files, accessing business operations, and exiting the application.
  - Ensure that user inputs are correctly read and processed.

- **Implement List Files Functionality:**
  - Create a method to list all files in the specified directory.
  - Initially, sort files in ascending order (sorting will be optimized in Sprint 3).
  - Ensure basic error handling for invalid user inputs.
  - Display user-friendly error messages.

- **Basic Error Handling:**
  - Implement basic error handling for invalid user inputs.
  - Ensure the application does not crash on invalid inputs.
  - Display user-friendly error messages.

---

#### Sprint 2: Business Operations and File Management
**Duration:** 5 days

##### Tasks:
- **Implement Add, Delete, and Search File Functionalities:**
  - **Add File:** Create a method to add a new file to the directory.
  - **Delete File:** Create a method to delete an existing file from the directory.
  - **Search File:** Create a method to search for a specific file in the directory.

- **Enhance Business Operations Menu:**
  - Add options for add, delete, and search functionalities.
  - Ensure smooth navigation between the business operations menu and the main menu.
  - Provide clear prompts and feedback to the user.

- **Advanced Error Handling and Validation:**
  - Implement advanced error handling for file operations (e.g., handle file not found, file already exists, etc.).
  - Validate user inputs to prevent invalid file names and operations.
  - Ensure all exceptions are properly caught and handled with appropriate messages.

---

#### Sprint 3: Optimization and Testing
**Duration:** 5 days

##### Tasks:
- **Implement Sorting Algorithms:**
  - Implement a custom case-insensitive sorting algorithm (e.g., selection sort) for listing files.
  - Optimize the list files method to use the custom sorting algorithm and display files in sorted order.

- **Optimize Code for Performance:**
  - Review and refactor the code for better performance and readability.
  - Optimize file operations to handle large directories efficiently.
  - Ensure the application follows best practices and coding standards.

- **Testing and Debugging:**
  - Conduct thorough testing of all functionalities.
  - Identify and fix bugs and issues.
  - Test edge cases and validate the robustness of error handling.
  - Perform user acceptance testing to ensure the application meets the specified requirements.

- **Final Documentation:**
  - Prepare the final project documentation, including a user manual.
  - Document the code with comments and explanations.
  - Update the README file with project details, setup instructions, and usage guidelines.
  - Ensure all documentation is clear, concise, and comprehensive.
