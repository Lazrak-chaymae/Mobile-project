import { useNavigation } from '@react-navigation/native';

import { StyleSheet, Text, View, Button } from 'react-native';

function WelcomeScreen() {
  const navigation = useNavigation();


  return (
    <View style={styles.rootContainer}>
      <Text style={styles.title}>Welcome!</Text>
      <Text>You have successfully logged in.</Text>
      <Text style={styles.description}>
        Start by exploring your favorite places or add new ones to your collection. 
        Click the button below to get started!
      </Text>
      <Button
        title="My Favorite Places"
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
  description: {
    fontSize: 16,
    marginVertical: 20,
    textAlign: 'center',
    paddingHorizontal: 20,
  },
});
