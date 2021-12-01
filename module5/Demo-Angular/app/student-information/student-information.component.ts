import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {

  @Input()
  studentDetail: any;

  @Output()
  changeMarkStudent: EventEmitter<number> = new EventEmitter<number>();
  constructor() { }

  ngOnInit(): void {
  }

  setMark(event: Event){
    // @ts-ignore
    const newMark = event.target.value;
    this.changeMarkStudent.emit(newMark);
  }
}
