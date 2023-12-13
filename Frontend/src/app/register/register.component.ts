import { Component } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {

  forms!: FormGroup<any>;



  constructor(private fb: FormBuilder){
    
  }

onSubmit(): void {
throw new Error('Method not implemented.');
}

}
