import './newProgram.css';
import React, { useState } from 'react';

import { ProgramData } from '../programs/programData';

export const NewProgram: React.FC = () => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const [submittedProgram, setSubmittedProgram] = useState<ProgramData | null>(null);

  const handleSubmission = (e: React.FormEvent) => {
    e.preventDefault();
    const newProgram: ProgramData = { title, description };
    setSubmittedProgram(newProgram);
    setTitle('');
    setDescription('');
  };

  return (
    <section className="form-page">
      <div className="form-container">
        <h2>
          Would you like to add a program to{' '}
          <em className="highlight">Code Differently?</em>
        </h2>

        <form onSubmit={handleSubmission}>
          <div className="form-group">
            <label htmlFor="title">Title:</label>
            <input
              type="text"
              id="title"
              value={title}
              onChange={e => setTitle(e.target.value)}
              required
            />
          </div>

          <div className="form-group">
            <label htmlFor="description">Description:</label>
            <textarea
              id="description"
              value={description}
              onChange={e => setDescription(e.target.value)}
              required
            />
          </div>

          <button type="submit">Submit your Program!</button>
        </form>

        {submittedProgram && (
          <>
            <p>{submittedProgram.title}</p>
            <p>{submittedProgram.description}</p>
          </>
        )}
      </div>
    </section>
  );
};

export default NewProgram;
