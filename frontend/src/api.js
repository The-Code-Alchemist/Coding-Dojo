export const fetchTutorials = async (category) => {
    const response = await fetch(`http://localhost:8080/api/tutorials?source=${category}`);
    return response.json();
};
