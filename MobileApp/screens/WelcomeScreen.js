import axios from 'axios';
import { useContext, useEffect, useState } from 'react';
import { useNavigation } from '@react-navigation/native';

import { StyleSheet, Text, View, Button } from 'react-native';
import { AuthContext } from '../store/auth-context';

function WelcomeScreen() {
  const [fetchedMessage, setFetchedMessage] = useState('');
  const navigation = useNavigation();

  const authCtx = useContext(AuthContext);
  const token = authCtx.token;

  useEffect(() => {
    axios
      .get(
        'https://mobile-app-55d0e-default-rtdb.firebaseio.com/message.json?auth=' +
          token
      )
      .then((response) => {
        setFetchedMessage(response.data);
      });
  }, [token]);

  return (
    <View style={styles.rootContainer}>
      <Text style={styles.title}>Welcome!</Text>
      <Text>You authenticated successfully!</Text>
      <Text>{fetchedMessage}</Text>
      <Button
        title="Go to All Places"
        onPress={() => navigation.navigate('Places', { screen: 'AllPlaces' })}
      />
    </View>
  );
}

export default WelcomeScreen;

const styles = StyleSheet.create({
  rootContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 32,
  },
  title: {
    fontSize: 20,
    fontWeight: 'bold',
    marginBottom: 8,
  },
});
