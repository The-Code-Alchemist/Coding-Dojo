import React from "react";

const TutorialList = ({ tutorials }) => {
    return (
        <div className="mt-4">
            {tutorials.length === 0 ? (
                <p>No tutorials found.</p>
            ) : (
                <ul>
                    {tutorials.map((tutorial) => (
                        <li key={tutorial.id} className="p-2 border-b">
                            <a href={tutorial.link} target="_blank" rel="noopener noreferrer">
                                <strong>{tutorial.title}</strong> ({tutorial.platform})
                            </a>
                        </li>
                    ))}
                </ul>
            )}
        </div>
    );
};

export default TutorialList;
