import { Component, OnInit } from '@angular/core';
import {listStudent} from '../models/studentDAO';
import {IStudent} from '../models/IStudent';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  constructor() { }

  listStudents = listStudent;
  student = {};

  ngOnInit(): void {
  }

  getIdStudent(value: IStudent){
    this.student = value;
  }
}
