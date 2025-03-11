import React, { useState, useEffect } from "react";
import CategorySelector from "../components/CategorySelector";
import TutorialList from "../components/TutorialList";
import { fetchTutorials } from "../api";

const Home = () => {
    const [category, setCategory] = useState("YouTube");
    const [tutorials, setTutorials] = useState([]);

    useEffect(() => {
        fetchTutorials(category).then(setTutorials);
    }, [category]);

    return (
        <div className="container mx-auto p-4">
            <h1 className="text-2xl font-bold">Coding-Dojo Tutorials</h1>
            <CategorySelector selectedCategory={category} setCategory={setCategory} />
            <TutorialList tutorials={tutorials} />
        </div>
    );
};

export default Home;
