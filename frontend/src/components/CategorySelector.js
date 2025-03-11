import React from "react";

const CategorySelector = ({ selectedCategory, setCategory }) => {
    const categories = ["YouTube", "Udemy", "Other Sources"];

    return (
        <div className="p-4 bg-gray-100 rounded-lg shadow-md">
            <h2 className="text-xl font-bold mb-2">Select Category</h2>
            <div className="flex space-x-4">
                {categories.map((category) => (
                    <button
                        key={category}
                        onClick={() => setCategory(category)}
                        className={`px-4 py-2 rounded-lg ${
                            selectedCategory === category ? "bg-blue-500 text-white" : "bg-gray-200"
                        }`}
                    >
                        {category}
                    </button>
                ))}
            </div>
        </div>
    );
};

export default CategorySelector;
