# MyPlace App
MyPlace is a mobile application built with React Native and Spring Boot, designed to help users capture and save their favorite places. Users can add locations with a title, image, and coordinates, view all saved places, and manage their collection effortlessly.

# Features
 **-Add New Places:** Users can add a new place by entering a title, taking or selecting a photo, and choosing a location either through GPS or map selection.
 
 **-View All Places:** View a list of all the places you’ve saved, complete with images, addresses, and geographical coordinates.
 
 **-Secure Authentication:** The app uses Firebase Authentication to securely sign up and log in users, ensuring their data remains private and protected.
 
 **-Responsive Design:** The app features a responsive and user-friendly interface that works seamlessly across different devices and screen sizes.

# Technologies Used
**Frontend:** React Native, Expo

**Backend:** Spring Boot, MySQL

**Authentication:** Firebase Authentication

**API Integration:** Axios for handling API requests

**Location Services:** Expo Location, Google Maps API for geocoding and map previews


# Issues and Troubleshooting
**Google API Key**
Currently, the application is experiencing issues with Google Maps functionality. This is due to the use of an expired API key. To resolve this, you'll need to:

-Obtain a New Google API Key.

-Sign in to the Google Cloud Console.

-Navigate to the API & Services section.

-Generate a new API key and replace the expired key in your code.

-Update API Key in Code (util/location.js).

-Replace the expired API key in your project with the newly obtained key.


**-Axios Network Error**
The application is encountering network errors when making API requests using Axios. However, the same requests work in Postman
