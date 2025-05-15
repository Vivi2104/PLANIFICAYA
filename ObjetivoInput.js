import React, { useState } from 'react';
import { View, TextInput, Button, FlatList } from 'react-native';

const GoalInputScreen = () => {
  const [goal, setGoal] = useState('');
  const [tasks, setTasks] = useState([]);

  const handleBreakdown = () => {
    const mockTasks = [
      `1. Investigar sobre ${goal}`,
      `2. Practicar ${goal}`,
    ];
    setTasks(mockTasks);
  };

  return (
    <View>
      <TextInput placeholder="Ingresa tu meta" value={goal} onChangeText={setGoal} />
      <Button title="Desglosar" onPress={handleBreakdown} />
      <FlatList data={tasks} renderItem={({ item }) => <Text>{item}</Text>} />
    </View>
  );
};

export default GoalInputScreen;
