import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'iReportUI';
  report :string | undefined;
  onSubmit(): void{
    this.report = "UPLOADED"
  }

}
