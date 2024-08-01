export class Place {
    constructor(title, imageUri, location, id, userEmail) {
      this.title = title;
      this.imageUri = imageUri;
      this.id= id;
      this.address = location.address;
      this.location = { lat: location.lat, lng: location.lng }; // { lat: 0.141241, lng: 127.121 }
      this.userEmail = userEmail;
    }
  }