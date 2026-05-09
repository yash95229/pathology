import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-test-master',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './test-master.component.html'
})
export class TestMasterComponent implements OnInit {

  tests: any[] = [];

  formData = {
    testName: '',
    testCode: '',
    sampleType: '',
    normalRange: '',
    price: 0
  };

  constructor(private api: ApiService) {}

  ngOnInit(): void {
    this.loadTests();
  }

  loadTests() {

    this.api.getTests().subscribe({

      next: (res: any) => {

        console.log(res);

        this.tests = res;
      },

      error: (err) => {
        console.log(err);
      }
    });
  }

  saveTest() {

    this.api.createTest(this.formData).subscribe({

      next: () => {

        this.loadTests();

        this.formData = {
          testName: '',
          testCode: '',
          sampleType: '',
          normalRange: '',
          price: 0
        };
      },

      error: (err) => {
        console.log(err);
      }
    });
  }
}