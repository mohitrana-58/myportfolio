// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyDu32VS74cFtaxqGPcsDzkySkjgwissnaY",
  authDomain: "project-d10a6.firebaseapp.com",
  projectId: "project-d10a6",
  storageBucket: "project-d10a6.firebasestorage.app",
  messagingSenderId: "536711595986",
  appId: "1:536711595986:web:4d4fccf2b9e52057512a0b",
  measurementId: "G-EJHQNHBS72"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);



