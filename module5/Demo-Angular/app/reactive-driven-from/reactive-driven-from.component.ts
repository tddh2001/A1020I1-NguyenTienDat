import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {listStudent} from '../models/studentDAO';


@Component({
  selector: 'app-reactive-driven-from',
  templateUrl: './reactive-driven-from.component.html',
  styleUrls: ['./reactive-driven-from.component.css']
})
export class ReactiveDrivenFromComponent implements OnInit {

  studentForm: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.studentForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.min(0)]),
      name: new FormControl('', Validators.required),
      age: new FormControl('', Validators.required),
      mark: new FormControl('', Validators.required),
      avatar: new FormControl('chua co link', Validators.required)
    });
  }

  getStudentValue() {
    listStudent.unshift(this.studentForm.value);
  }
}
