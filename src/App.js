import React from 'react'
import Navbar from './components/Navbar'

import { Routes, Route } from 'react-router-dom'
import Home from './Pages/Home'
import AddUser from './users/AddUser'
import EditUser from './users/EditUser'
import ViewUser from './users/ViewUser'


function App() {
  return (
    <div className='App'>
        <Navbar />
          <Routes>
            <Route path='/' element={<Home />} />
            <Route path='/adduser' element={<AddUser />} />
            <Route path='/edituser/:id' element={<EditUser />} />
            <Route path='/viewuser/:id' element={<ViewUser />} />
          </Routes>
    </div>
  )
}

export default App