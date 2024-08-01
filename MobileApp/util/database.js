import axios from "axios"; 

const API_BASE_URL = 'http://localhost:8024/api';

// Insert a place
export async function insertPlace(place) {
  try {
    const response = await axios.post(`${API_BASE_URL}/place`, place);
    return response.data;
    return result;
  } catch (error) {
    console.error('Failed to insert place', error);
    throw error;
  }
}

// Fetch all places
export async function fetchPlaces(userEmail) {
  try {
    const response = await axios.get(`${API_BASE_URL}/places/${userEmail}`);
    return response.data;
  } catch (error) {
    console.error('Failed to fetch places', error);
    throw error;
  }
}

// Fetch place details by id
export async function fetchPlaceDetails(id) {
  try {
    const response = await axios.get(`${API_BASE_URL}/place/${id}`);
    return response.data;
  } catch (error) {
    console.error('Failed to fetch place details', error);
    throw error;
  }
}
